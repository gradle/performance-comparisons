package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_133 {
    private final Production97_133 production = new Production97_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}