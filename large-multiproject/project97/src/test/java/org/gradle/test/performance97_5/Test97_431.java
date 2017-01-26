package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_431 {
    private final Production97_431 production = new Production97_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}