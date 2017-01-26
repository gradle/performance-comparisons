package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_39 {
    private final Production9_39 production = new Production9_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}