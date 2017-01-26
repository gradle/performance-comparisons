package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_28 {
    private final Production69_28 production = new Production69_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}