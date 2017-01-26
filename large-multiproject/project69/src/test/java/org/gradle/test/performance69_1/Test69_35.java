package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_35 {
    private final Production69_35 production = new Production69_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}