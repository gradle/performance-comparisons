package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_455 {
    private final Production9_455 production = new Production9_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}