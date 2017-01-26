package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_153 {
    private final Production91_153 production = new Production91_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}