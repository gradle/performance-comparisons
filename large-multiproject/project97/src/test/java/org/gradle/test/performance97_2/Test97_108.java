package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_108 {
    private final Production97_108 production = new Production97_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}