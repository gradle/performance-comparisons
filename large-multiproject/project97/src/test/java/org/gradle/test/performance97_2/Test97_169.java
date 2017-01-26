package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_169 {
    private final Production97_169 production = new Production97_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}