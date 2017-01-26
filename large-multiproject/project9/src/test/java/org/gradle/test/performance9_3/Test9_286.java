package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_286 {
    private final Production9_286 production = new Production9_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}