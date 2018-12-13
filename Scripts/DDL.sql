-- 내 스키마
DROP SCHEMA IF EXISTS `ncs_test_kbm`;

-- 내 스키마
CREATE SCHEMA `ncs_test_kbm`;

-- 부서
CREATE TABLE `ncs_test_kbm`.`department` (
	`deptno`   CHAR(4)     NOT NULL COMMENT '부서번호', -- 부서번호
	`deptname` VARCHAR(10) NOT NULL COMMENT '부서명', -- 부서명
	`floor`    INT(11)     NOT NULL COMMENT '위치' -- 위치
)
COMMENT '부서';

-- 부서
ALTER TABLE `ncs_test_kbm`.`department`
	ADD CONSTRAINT `PK_department` -- 부서 기본키
		PRIMARY KEY (
			`deptno` -- 부서번호
		);

-- 직책
CREATE TABLE `ncs_test_kbm`.`title` (
	`no`        CHAR(4)     NOT NULL COMMENT '번호', -- 번호
	`titlename` VARCHAR(20) NOT NULL COMMENT '직책명' -- 직책명
)
COMMENT '직책';

-- 직책
ALTER TABLE `ncs_test_kbm`.`title`
	ADD CONSTRAINT `PK_title` -- 직책 기본키
		PRIMARY KEY (
			`no` -- 번호
		);

-- 사원
CREATE TABLE `ncs_test_kbm`.`employee` (
	`empno`   CHAR(4)     NOT NULL COMMENT '사원번호', -- 사원번호
	`empname` VARCHAR(20) NOT NULL COMMENT '사원명', -- 사원명
	`title`   CHAR(4)     NOT NULL COMMENT '직책', -- 직책
	`manager` CHAR(4)     NOT NULL COMMENT '매니저', -- 매니저
	`salary`  INT(11)     NOT NULL COMMENT '급여', -- 급여
	`dno`     CHAR(4)     NOT NULL COMMENT '부서' -- 부서
)
COMMENT '사원';

-- 사원
ALTER TABLE `ncs_test_kbm`.`employee`
	ADD CONSTRAINT `PK_employee` -- 사원 기본키
		PRIMARY KEY (
			`empno` -- 사원번호
		);

-- 사원
ALTER TABLE `ncs_test_kbm`.`employee`
	ADD CONSTRAINT `FK_title_TO_employee` -- 직책 -> 사원
		FOREIGN KEY (
			`title` -- 직책
		)
		REFERENCES `ncs_test_kbm`.`title` ( -- 직책
			`no` -- 번호
		);

-- 사원
ALTER TABLE `ncs_test_kbm`.`employee`
	ADD CONSTRAINT `FK_employee_TO_employee` -- 사원 -> 사원
		FOREIGN KEY (
			`manager` -- 매니저
		)
		REFERENCES `ncs_test_kbm`.`employee` ( -- 사원
			`empno` -- 사원번호
		);

-- 사원
ALTER TABLE `ncs_test_kbm`.`employee`
	ADD CONSTRAINT `FK_department_TO_employee` -- 부서 -> 사원
		FOREIGN KEY (
			`dno` -- 부서
		)
		REFERENCES `ncs_test_kbm`.`department` ( -- 부서
			`deptno` -- 부서번호
		);