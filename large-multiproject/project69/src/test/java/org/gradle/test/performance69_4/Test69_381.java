package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_381 {
    private final Production69_381 production = new Production69_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}