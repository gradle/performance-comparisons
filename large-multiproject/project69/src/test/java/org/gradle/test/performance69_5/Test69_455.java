package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_455 {
    private final Production69_455 production = new Production69_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}