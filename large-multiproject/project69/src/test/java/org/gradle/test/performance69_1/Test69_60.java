package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_60 {
    private final Production69_60 production = new Production69_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}