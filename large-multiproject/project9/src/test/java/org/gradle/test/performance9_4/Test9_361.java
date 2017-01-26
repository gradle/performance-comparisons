package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_361 {
    private final Production9_361 production = new Production9_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}