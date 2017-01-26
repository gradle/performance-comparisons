package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_43 {
    private final Production3_43 production = new Production3_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}