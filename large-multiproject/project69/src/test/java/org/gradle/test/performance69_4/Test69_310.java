package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_310 {
    private final Production69_310 production = new Production69_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}