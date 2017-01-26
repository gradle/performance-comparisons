package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_265 {
    private final Production97_265 production = new Production97_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}