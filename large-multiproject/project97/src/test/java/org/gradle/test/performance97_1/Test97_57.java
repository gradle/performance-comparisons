package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_57 {
    private final Production97_57 production = new Production97_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}