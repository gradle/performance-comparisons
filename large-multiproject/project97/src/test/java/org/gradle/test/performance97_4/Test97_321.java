package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_321 {
    private final Production97_321 production = new Production97_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}