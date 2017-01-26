package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_330 {
    private final Production69_330 production = new Production69_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}