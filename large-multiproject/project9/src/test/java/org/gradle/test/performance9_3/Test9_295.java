package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_295 {
    private final Production9_295 production = new Production9_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}