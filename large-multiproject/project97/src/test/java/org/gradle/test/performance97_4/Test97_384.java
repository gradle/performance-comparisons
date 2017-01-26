package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_384 {
    private final Production97_384 production = new Production97_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}