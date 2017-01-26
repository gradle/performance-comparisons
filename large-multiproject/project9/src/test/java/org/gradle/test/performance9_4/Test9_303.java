package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_303 {
    private final Production9_303 production = new Production9_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}