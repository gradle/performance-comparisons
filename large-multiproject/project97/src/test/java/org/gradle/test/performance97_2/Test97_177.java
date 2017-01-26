package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_177 {
    private final Production97_177 production = new Production97_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}