package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_124 {
    private final Production97_124 production = new Production97_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}