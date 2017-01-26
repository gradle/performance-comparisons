package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_274 {
    private final Production97_274 production = new Production97_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}