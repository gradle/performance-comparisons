package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_247 {
    private final Production69_247 production = new Production69_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}