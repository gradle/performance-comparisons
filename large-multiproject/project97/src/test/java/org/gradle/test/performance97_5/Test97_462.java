package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_462 {
    private final Production97_462 production = new Production97_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}