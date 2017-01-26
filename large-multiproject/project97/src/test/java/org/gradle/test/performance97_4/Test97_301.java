package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_301 {
    private final Production97_301 production = new Production97_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}