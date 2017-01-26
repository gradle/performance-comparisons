package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_254 {
    private final Production97_254 production = new Production97_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}