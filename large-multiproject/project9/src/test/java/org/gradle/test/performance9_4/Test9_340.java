package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_340 {
    private final Production9_340 production = new Production9_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}