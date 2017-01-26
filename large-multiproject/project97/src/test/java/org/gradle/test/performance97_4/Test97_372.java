package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_372 {
    private final Production97_372 production = new Production97_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}