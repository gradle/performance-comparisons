package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_222 {
    private final Production69_222 production = new Production69_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}