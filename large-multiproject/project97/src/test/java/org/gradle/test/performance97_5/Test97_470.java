package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_470 {
    private final Production97_470 production = new Production97_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}