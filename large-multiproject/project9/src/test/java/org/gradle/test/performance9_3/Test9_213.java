package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_213 {
    private final Production9_213 production = new Production9_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}