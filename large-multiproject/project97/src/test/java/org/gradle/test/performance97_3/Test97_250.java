package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_250 {
    private final Production97_250 production = new Production97_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}