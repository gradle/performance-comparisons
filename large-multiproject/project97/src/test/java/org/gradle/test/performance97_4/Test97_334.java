package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_334 {
    private final Production97_334 production = new Production97_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}