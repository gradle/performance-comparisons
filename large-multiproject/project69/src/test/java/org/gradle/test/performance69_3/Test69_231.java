package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_231 {
    private final Production69_231 production = new Production69_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}