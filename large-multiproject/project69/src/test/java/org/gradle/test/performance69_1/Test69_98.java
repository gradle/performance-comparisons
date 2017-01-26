package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_98 {
    private final Production69_98 production = new Production69_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}