package tests.day10_TestNGFramework;

import org.testng.annotations.*;

public class C03_BeforeAfterNotasyonlari {
    /*
    Smoke Test
    RegressionTest
    EntToEnd(E2E)

    Test Suite: Birden fazla Test'in bir amac icin biraraya getirilmesidir.

    Test: Bir amac aicin biraraya getirilmis test method'lari, class'lari ve/veya package'lari icerir.

    Test Hiyerarsisi:
    -Suite
    _Test-
    groups, packages, classes, methods
     */

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("Before suite");

    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test");

    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");

    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method");

    }
    @Test
    public void test01(){
        System.out.println("test1");

    }
    @Test
    public void test02(){
        System.out.println("test2");

    }
    @Test
    public void test03(){
        System.out.println("test3");

    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite");

    }
    @AfterTest
    public void afterTest(){
        System.out.println("After test");

    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class");

    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After method");

    }
}
