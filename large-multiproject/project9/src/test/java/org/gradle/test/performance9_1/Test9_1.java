package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_1 {
    private final Production9_1 production = new Production9_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}