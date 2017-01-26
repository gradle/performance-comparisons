package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_324 {
    private final Production69_324 production = new Production69_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}