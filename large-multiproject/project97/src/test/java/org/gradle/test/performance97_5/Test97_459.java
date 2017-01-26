package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_459 {
    private final Production97_459 production = new Production97_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}