package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_190 {
    private final Production69_190 production = new Production69_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}