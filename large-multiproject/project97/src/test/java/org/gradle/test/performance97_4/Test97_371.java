package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_371 {
    private final Production97_371 production = new Production97_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}