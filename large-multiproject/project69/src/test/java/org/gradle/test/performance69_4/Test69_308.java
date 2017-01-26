package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_308 {
    private final Production69_308 production = new Production69_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}