package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8079 {
    private final Productionnull_8079 production = new Productionnull_8079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}