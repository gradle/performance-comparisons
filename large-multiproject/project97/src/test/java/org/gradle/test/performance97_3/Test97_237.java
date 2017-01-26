package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_237 {
    private final Production97_237 production = new Production97_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}