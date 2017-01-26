package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_307 {
    private final Production9_307 production = new Production9_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}