package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_164 {
    private final Production97_164 production = new Production97_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}