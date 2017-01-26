package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_12 {
    private final Production97_12 production = new Production97_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}