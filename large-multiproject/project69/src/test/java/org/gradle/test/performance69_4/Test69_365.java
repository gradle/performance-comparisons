package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_365 {
    private final Production69_365 production = new Production69_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}