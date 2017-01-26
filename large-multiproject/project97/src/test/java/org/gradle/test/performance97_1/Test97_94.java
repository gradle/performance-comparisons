package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_94 {
    private final Production97_94 production = new Production97_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}