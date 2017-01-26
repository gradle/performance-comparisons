package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_20 {
    private final Production9_20 production = new Production9_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}