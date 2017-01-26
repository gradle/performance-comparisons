package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_8 {
    private final Production88_8 production = new Production88_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}