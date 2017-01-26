package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_492 {
    private final Production69_492 production = new Production69_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}