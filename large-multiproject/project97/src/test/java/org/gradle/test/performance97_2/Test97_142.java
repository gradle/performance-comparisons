package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_142 {
    private final Production97_142 production = new Production97_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}