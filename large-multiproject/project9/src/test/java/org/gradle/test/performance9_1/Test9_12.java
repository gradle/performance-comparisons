package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_12 {
    private final Production9_12 production = new Production9_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}