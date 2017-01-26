package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_118 {
    private final Production97_118 production = new Production97_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}