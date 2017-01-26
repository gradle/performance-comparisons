package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_87 {
    private final Production9_87 production = new Production9_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}