package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_486 {
    private final Production97_486 production = new Production97_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}