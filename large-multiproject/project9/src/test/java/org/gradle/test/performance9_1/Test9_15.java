package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_15 {
    private final Production9_15 production = new Production9_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}