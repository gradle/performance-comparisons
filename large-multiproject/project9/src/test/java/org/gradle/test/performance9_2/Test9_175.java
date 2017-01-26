package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_175 {
    private final Production9_175 production = new Production9_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}