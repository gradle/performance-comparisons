package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_88 {
    private final Production9_88 production = new Production9_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}