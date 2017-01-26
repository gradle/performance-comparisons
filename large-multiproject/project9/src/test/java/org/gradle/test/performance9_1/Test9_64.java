package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_64 {
    private final Production9_64 production = new Production9_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}