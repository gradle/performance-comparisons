package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_170 {
    private final Production69_170 production = new Production69_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}