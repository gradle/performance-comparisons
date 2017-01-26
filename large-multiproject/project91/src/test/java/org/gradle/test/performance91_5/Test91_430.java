package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_430 {
    private final Production91_430 production = new Production91_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}