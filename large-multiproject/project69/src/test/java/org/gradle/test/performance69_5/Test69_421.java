package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_421 {
    private final Production69_421 production = new Production69_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}