package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_190 {
    private final Production97_190 production = new Production97_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}