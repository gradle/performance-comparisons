package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_114 {
    private final Production69_114 production = new Production69_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}