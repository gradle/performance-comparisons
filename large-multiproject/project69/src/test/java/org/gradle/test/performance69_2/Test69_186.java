package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_186 {
    private final Production69_186 production = new Production69_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}