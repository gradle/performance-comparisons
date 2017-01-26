package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_256 {
    private final Production97_256 production = new Production97_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}