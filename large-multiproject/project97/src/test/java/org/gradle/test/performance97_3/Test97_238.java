package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_238 {
    private final Production97_238 production = new Production97_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}