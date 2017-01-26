package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_478 {
    private final Production91_478 production = new Production91_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}