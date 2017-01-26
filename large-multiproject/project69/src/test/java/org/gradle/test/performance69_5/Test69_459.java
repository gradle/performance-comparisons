package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_459 {
    private final Production69_459 production = new Production69_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}