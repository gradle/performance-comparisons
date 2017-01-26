package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_174 {
    private final Production9_174 production = new Production9_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}