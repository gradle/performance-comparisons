package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_436 {
    private final Production9_436 production = new Production9_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}