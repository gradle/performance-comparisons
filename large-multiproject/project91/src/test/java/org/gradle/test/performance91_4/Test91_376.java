package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_376 {
    private final Production91_376 production = new Production91_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}