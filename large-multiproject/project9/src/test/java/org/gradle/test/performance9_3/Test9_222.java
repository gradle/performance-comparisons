package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_222 {
    private final Production9_222 production = new Production9_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}