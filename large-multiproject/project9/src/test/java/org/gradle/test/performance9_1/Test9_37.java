package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_37 {
    private final Production9_37 production = new Production9_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}