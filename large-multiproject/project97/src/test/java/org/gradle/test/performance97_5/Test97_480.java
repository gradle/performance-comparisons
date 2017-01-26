package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_480 {
    private final Production97_480 production = new Production97_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}