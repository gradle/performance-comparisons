package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_345 {
    private final Production9_345 production = new Production9_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}