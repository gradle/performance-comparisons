package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_59 {
    private final Production69_59 production = new Production69_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}