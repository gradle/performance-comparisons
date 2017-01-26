package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_57 {
    private final Production9_57 production = new Production9_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}