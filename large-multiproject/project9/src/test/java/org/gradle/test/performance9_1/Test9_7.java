package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_7 {
    private final Production9_7 production = new Production9_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}