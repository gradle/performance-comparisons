package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_43 {
    private final Production88_43 production = new Production88_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}