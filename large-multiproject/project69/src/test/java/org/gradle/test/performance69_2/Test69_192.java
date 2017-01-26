package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_192 {
    private final Production69_192 production = new Production69_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}