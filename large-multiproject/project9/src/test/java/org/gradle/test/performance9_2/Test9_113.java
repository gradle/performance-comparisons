package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_113 {
    private final Production9_113 production = new Production9_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}