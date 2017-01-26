package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_482 {
    private final Production97_482 production = new Production97_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}