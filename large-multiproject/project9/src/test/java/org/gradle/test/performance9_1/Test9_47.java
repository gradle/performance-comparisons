package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_47 {
    private final Production9_47 production = new Production9_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}