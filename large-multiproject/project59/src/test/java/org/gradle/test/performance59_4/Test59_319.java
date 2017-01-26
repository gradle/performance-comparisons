package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_319 {
    private final Production59_319 production = new Production59_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}