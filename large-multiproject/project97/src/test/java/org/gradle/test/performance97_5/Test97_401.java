package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_401 {
    private final Production97_401 production = new Production97_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}