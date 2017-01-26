package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_266 {
    private final Production69_266 production = new Production69_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}