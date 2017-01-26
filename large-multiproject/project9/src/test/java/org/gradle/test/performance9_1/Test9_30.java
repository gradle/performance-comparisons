package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_30 {
    private final Production9_30 production = new Production9_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}