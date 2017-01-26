package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_429 {
    private final Production97_429 production = new Production97_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}