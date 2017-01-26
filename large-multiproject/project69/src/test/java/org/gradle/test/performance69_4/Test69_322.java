package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_322 {
    private final Production69_322 production = new Production69_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}