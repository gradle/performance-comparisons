package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_290 {
    private final Production9_290 production = new Production9_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}