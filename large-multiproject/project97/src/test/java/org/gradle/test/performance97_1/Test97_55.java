package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_55 {
    private final Production97_55 production = new Production97_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}