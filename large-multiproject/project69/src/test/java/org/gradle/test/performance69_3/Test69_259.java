package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_259 {
    private final Production69_259 production = new Production69_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}