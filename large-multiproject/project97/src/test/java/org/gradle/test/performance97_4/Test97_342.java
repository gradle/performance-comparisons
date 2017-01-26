package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_342 {
    private final Production97_342 production = new Production97_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}