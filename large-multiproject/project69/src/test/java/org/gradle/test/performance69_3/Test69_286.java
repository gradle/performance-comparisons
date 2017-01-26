package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_286 {
    private final Production69_286 production = new Production69_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}