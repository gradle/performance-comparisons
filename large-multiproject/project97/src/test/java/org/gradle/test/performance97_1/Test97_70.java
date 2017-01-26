package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_70 {
    private final Production97_70 production = new Production97_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}