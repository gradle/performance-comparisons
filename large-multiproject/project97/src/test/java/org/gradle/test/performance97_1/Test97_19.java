package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_19 {
    private final Production97_19 production = new Production97_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}