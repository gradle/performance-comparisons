package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_226 {
    private final Production97_226 production = new Production97_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}