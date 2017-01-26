package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_469 {
    private final Production69_469 production = new Production69_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}