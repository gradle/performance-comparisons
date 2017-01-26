package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_343 {
    private final Production9_343 production = new Production9_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}