package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_489 {
    private final Production69_489 production = new Production69_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}