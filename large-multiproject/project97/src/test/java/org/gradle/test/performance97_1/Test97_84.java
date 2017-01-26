package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_84 {
    private final Production97_84 production = new Production97_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}