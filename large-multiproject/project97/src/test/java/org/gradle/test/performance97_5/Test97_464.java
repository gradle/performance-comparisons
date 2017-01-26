package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_464 {
    private final Production97_464 production = new Production97_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}