package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_341 {
    private final Production97_341 production = new Production97_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}