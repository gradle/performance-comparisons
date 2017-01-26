package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_18 {
    private final Production97_18 production = new Production97_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}