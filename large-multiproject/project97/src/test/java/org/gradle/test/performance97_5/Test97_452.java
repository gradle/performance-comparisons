package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_452 {
    private final Production97_452 production = new Production97_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}