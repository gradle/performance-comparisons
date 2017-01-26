package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_52 {
    private final Production97_52 production = new Production97_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}