package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_92 {
    private final Production9_92 production = new Production9_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}