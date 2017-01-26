package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_170 {
    private final Production97_170 production = new Production97_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}