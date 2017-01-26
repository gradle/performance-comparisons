package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_197 {
    private final Production69_197 production = new Production69_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}