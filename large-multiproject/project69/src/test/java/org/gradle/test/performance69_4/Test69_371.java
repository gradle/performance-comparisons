package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_371 {
    private final Production69_371 production = new Production69_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}