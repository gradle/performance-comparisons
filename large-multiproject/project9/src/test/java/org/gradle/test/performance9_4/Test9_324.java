package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_324 {
    private final Production9_324 production = new Production9_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}