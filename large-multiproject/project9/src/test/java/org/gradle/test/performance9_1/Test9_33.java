package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_33 {
    private final Production9_33 production = new Production9_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}