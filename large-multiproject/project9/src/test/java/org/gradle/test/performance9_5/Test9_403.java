package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_403 {
    private final Production9_403 production = new Production9_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}