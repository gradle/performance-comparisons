package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_410 {
    private final Production9_410 production = new Production9_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}