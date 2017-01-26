package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_59 {
    private final Production9_59 production = new Production9_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}