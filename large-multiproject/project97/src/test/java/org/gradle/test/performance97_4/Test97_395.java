package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_395 {
    private final Production97_395 production = new Production97_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}