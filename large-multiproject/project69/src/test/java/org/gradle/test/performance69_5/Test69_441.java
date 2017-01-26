package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_441 {
    private final Production69_441 production = new Production69_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}