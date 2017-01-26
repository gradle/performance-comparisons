package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_206 {
    private final Production97_206 production = new Production97_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}