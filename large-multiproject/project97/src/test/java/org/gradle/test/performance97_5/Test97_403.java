package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_403 {
    private final Production97_403 production = new Production97_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}