package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_53 {
    private final Production69_53 production = new Production69_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}