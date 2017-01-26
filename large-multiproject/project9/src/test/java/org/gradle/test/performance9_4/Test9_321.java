package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_321 {
    private final Production9_321 production = new Production9_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}