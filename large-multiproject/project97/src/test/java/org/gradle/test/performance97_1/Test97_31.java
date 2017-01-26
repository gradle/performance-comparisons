package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_31 {
    private final Production97_31 production = new Production97_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}