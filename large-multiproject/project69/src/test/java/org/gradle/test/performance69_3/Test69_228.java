package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_228 {
    private final Production69_228 production = new Production69_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}