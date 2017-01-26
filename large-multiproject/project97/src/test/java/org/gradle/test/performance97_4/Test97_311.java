package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_311 {
    private final Production97_311 production = new Production97_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}