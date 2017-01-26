package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_43 {
    private final Production31_43 production = new Production31_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}