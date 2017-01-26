package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_161 {
    private final Production69_161 production = new Production69_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}