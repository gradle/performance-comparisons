package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_20 {
    private final Production97_20 production = new Production97_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}