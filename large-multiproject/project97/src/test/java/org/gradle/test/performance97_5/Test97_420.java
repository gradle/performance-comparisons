package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_420 {
    private final Production97_420 production = new Production97_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}