package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_330 {
    private final Production9_330 production = new Production9_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}