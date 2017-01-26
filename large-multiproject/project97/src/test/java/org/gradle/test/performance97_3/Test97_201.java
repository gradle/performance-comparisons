package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_201 {
    private final Production97_201 production = new Production97_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}