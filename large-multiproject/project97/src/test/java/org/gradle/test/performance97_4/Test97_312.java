package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_312 {
    private final Production97_312 production = new Production97_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}