package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_343 {
    private final Production69_343 production = new Production69_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}