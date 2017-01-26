package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_119 {
    private final Production9_119 production = new Production9_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}