package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_453 {
    private final Production9_453 production = new Production9_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}