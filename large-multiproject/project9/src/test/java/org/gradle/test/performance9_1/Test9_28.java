package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_28 {
    private final Production9_28 production = new Production9_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}