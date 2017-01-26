package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_259 {
    private final Production9_259 production = new Production9_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}