package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_153 {
    private final Production59_153 production = new Production59_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}