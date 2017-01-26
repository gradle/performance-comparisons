package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_19 {
    private final Production9_19 production = new Production9_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}