package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_198 {
    private final Production97_198 production = new Production97_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}