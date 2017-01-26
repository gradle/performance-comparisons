package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_204 {
    private final Production69_204 production = new Production69_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}