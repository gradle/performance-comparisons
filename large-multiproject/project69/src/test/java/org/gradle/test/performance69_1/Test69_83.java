package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_83 {
    private final Production69_83 production = new Production69_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}