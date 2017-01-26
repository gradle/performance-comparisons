package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_221 {
    private final Production9_221 production = new Production9_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}