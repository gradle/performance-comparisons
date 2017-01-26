package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_184 {
    private final Production69_184 production = new Production69_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}