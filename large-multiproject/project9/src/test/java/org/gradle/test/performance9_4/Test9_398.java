package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_398 {
    private final Production9_398 production = new Production9_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}