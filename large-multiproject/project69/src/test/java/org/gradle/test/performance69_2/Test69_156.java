package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_156 {
    private final Production69_156 production = new Production69_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}