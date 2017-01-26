package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_39 {
    private final Production69_39 production = new Production69_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}