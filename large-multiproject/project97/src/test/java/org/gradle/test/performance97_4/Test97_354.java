package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_354 {
    private final Production97_354 production = new Production97_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}