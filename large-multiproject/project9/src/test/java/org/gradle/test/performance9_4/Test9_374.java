package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_374 {
    private final Production9_374 production = new Production9_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}