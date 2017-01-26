package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_280 {
    private final Production9_280 production = new Production9_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}