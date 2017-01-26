package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_142 {
    private final Production9_142 production = new Production9_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}