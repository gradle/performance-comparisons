package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_477 {
    private final Production69_477 production = new Production69_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}