package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_311 {
    private final Production9_311 production = new Production9_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}