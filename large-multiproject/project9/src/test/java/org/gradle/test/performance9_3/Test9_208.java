package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_208 {
    private final Production9_208 production = new Production9_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}