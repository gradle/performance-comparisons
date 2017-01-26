package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_319 {
    private final Production91_319 production = new Production91_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}