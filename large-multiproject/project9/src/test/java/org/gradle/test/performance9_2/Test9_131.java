package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_131 {
    private final Production9_131 production = new Production9_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}