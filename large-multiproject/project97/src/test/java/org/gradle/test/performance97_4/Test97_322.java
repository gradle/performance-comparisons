package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_322 {
    private final Production97_322 production = new Production97_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}