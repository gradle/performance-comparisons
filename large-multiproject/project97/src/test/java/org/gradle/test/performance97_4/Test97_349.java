package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_349 {
    private final Production97_349 production = new Production97_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}