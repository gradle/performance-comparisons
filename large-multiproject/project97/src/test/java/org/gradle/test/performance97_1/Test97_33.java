package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_33 {
    private final Production97_33 production = new Production97_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}