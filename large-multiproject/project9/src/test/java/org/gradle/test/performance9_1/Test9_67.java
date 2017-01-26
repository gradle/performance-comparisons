package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_67 {
    private final Production9_67 production = new Production9_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}