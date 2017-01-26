package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_115 {
    private final Production9_115 production = new Production9_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}