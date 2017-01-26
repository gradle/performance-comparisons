package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_121 {
    private final Production9_121 production = new Production9_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}