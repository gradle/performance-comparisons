package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_450 {
    private final Production97_450 production = new Production97_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}