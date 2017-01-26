package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_226 {
    private final Production9_226 production = new Production9_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}