package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_48 {
    private final Production69_48 production = new Production69_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}