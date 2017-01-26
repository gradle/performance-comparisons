package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_26 {
    private final Production9_26 production = new Production9_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}