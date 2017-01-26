package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_304 {
    private final Production9_304 production = new Production9_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}