package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_362 {
    private final Production9_362 production = new Production9_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}