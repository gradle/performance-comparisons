package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_18 {
    private final Production9_18 production = new Production9_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}