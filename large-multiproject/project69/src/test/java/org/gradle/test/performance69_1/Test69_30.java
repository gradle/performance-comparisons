package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_30 {
    private final Production69_30 production = new Production69_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}