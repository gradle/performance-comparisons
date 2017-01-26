package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_113 {
    private final Production97_113 production = new Production97_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}