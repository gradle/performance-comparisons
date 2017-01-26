package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_355 {
    private final Production97_355 production = new Production97_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}