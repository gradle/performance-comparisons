package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_187 {
    private final Production97_187 production = new Production97_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}