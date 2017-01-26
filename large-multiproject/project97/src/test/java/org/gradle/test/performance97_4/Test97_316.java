package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_316 {
    private final Production97_316 production = new Production97_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}