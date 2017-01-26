package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_84 {
    private final Production69_84 production = new Production69_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}