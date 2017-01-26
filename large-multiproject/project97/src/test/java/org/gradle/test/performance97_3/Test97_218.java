package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_218 {
    private final Production97_218 production = new Production97_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}