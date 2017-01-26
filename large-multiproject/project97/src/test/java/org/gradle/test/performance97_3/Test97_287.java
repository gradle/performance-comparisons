package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_287 {
    private final Production97_287 production = new Production97_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}