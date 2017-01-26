package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_252 {
    private final Production97_252 production = new Production97_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}