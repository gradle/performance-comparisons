package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_219 {
    private final Production69_219 production = new Production69_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}