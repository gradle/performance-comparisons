package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_104 {
    private final Production9_104 production = new Production9_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}