package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_261 {
    private final Production9_261 production = new Production9_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}