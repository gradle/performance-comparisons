package org.gradle.test.performancenull_439;

import static org.junit.Assert.*;

public class Testnull_43869 {
    private final Productionnull_43869 production = new Productionnull_43869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}