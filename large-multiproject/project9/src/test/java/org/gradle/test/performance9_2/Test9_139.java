package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_139 {
    private final Production9_139 production = new Production9_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}