package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_407 {
    private final Production97_407 production = new Production97_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}