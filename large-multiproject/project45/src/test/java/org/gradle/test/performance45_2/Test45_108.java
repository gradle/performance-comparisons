package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_108 {
    private final Production45_108 production = new Production45_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}