package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_476 {
    private final Production69_476 production = new Production69_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}