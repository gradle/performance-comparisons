package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_138 {
    private final Production69_138 production = new Production69_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}