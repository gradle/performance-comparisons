package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_6 {
    private final Production97_6 production = new Production97_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}