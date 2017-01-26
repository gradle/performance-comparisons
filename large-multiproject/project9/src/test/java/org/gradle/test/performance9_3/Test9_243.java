package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_243 {
    private final Production9_243 production = new Production9_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}