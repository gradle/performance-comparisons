package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_61 {
    private final Production9_61 production = new Production9_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}