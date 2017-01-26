package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_306 {
    private final Production9_306 production = new Production9_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}