package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_433 {
    private final Production91_433 production = new Production91_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}