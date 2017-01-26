package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_145 {
    private final Production9_145 production = new Production9_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}