package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_204 {
    private final Production97_204 production = new Production97_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}