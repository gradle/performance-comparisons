package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_197 {
    private final Production97_197 production = new Production97_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}