package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_243 {
    private final Production69_243 production = new Production69_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}