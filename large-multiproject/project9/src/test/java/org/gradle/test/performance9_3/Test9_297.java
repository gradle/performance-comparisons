package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_297 {
    private final Production9_297 production = new Production9_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}