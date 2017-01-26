package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_178 {
    private final Production97_178 production = new Production97_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}