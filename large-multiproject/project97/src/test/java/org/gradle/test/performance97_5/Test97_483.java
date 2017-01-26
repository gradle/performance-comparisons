package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_483 {
    private final Production97_483 production = new Production97_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}