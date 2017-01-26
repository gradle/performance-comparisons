package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_363 {
    private final Production97_363 production = new Production97_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}