package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_482 {
    private final Production9_482 production = new Production9_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}