package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_450 {
    private final Production69_450 production = new Production69_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}