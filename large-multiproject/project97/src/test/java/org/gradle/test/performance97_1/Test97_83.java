package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_83 {
    private final Production97_83 production = new Production97_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}