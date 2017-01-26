package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_320 {
    private final Production9_320 production = new Production9_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}