package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_103 {
    private final Production45_103 production = new Production45_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}