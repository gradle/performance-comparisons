package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_321 {
    private final Production69_321 production = new Production69_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}