package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_472 {
    private final Production9_472 production = new Production9_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}