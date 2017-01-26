package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_60 {
    private final Production9_60 production = new Production9_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}