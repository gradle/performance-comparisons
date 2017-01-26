package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_116 {
    private final Production45_116 production = new Production45_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}