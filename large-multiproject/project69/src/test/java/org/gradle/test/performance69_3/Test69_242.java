package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_242 {
    private final Production69_242 production = new Production69_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}