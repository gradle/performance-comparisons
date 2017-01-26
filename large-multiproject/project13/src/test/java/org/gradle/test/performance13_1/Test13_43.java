package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_43 {
    private final Production13_43 production = new Production13_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}