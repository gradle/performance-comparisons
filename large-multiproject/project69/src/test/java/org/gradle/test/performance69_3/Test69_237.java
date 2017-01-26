package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_237 {
    private final Production69_237 production = new Production69_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}