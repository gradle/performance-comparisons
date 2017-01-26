package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_305 {
    private final Production9_305 production = new Production9_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}