package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_419 {
    private final Production97_419 production = new Production97_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}