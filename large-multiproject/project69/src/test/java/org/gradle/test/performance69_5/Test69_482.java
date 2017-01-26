package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_482 {
    private final Production69_482 production = new Production69_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}