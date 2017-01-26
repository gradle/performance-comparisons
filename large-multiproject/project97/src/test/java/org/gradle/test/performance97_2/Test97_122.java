package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_122 {
    private final Production97_122 production = new Production97_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}