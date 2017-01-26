package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_409 {
    private final Production69_409 production = new Production69_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}