package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_284 {
    private final Production97_284 production = new Production97_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}