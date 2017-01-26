package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_192 {
    private final Production97_192 production = new Production97_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}