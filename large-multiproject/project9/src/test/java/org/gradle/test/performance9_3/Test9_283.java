package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_283 {
    private final Production9_283 production = new Production9_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}