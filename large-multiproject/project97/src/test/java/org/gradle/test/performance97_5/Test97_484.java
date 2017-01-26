package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_484 {
    private final Production97_484 production = new Production97_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}