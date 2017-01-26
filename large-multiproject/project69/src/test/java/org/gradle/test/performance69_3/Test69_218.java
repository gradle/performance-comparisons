package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_218 {
    private final Production69_218 production = new Production69_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}