package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_8 {
    private final Production9_8 production = new Production9_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}