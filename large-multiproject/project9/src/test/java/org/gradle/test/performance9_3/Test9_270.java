package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_270 {
    private final Production9_270 production = new Production9_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}