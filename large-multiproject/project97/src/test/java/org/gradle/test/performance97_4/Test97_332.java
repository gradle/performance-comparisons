package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_332 {
    private final Production97_332 production = new Production97_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}