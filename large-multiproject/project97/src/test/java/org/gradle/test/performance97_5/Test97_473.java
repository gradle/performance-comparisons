package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_473 {
    private final Production97_473 production = new Production97_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}