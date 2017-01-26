package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_322 {
    private final Production9_322 production = new Production9_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}