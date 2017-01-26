package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_340 {
    private final Production97_340 production = new Production97_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}