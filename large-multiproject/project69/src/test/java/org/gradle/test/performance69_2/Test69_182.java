package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_182 {
    private final Production69_182 production = new Production69_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}