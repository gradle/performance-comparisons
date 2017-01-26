package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_389 {
    private final Production9_389 production = new Production9_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}