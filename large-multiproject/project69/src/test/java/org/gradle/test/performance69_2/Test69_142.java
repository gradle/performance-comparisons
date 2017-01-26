package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_142 {
    private final Production69_142 production = new Production69_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}