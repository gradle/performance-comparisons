package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_440 {
    private final Production69_440 production = new Production69_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}