package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_469 {
    private final Production97_469 production = new Production97_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}