package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_313 {
    private final Production9_313 production = new Production9_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}