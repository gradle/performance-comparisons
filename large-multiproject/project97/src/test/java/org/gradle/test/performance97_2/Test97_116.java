package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_116 {
    private final Production97_116 production = new Production97_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}