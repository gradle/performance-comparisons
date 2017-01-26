package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_95 {
    private final Production9_95 production = new Production9_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}