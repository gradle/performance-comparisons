package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_224 {
    private final Production69_224 production = new Production69_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}