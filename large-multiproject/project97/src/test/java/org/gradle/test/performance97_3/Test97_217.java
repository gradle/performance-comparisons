package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_217 {
    private final Production97_217 production = new Production97_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}