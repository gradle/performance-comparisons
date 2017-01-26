package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_436 {
    private final Production97_436 production = new Production97_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}