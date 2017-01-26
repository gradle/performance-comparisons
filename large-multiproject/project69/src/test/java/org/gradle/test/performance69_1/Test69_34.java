package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_34 {
    private final Production69_34 production = new Production69_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}