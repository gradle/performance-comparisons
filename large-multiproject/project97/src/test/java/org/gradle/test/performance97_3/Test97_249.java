package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_249 {
    private final Production97_249 production = new Production97_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}