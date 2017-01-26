package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_345 {
    private final Production97_345 production = new Production97_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}