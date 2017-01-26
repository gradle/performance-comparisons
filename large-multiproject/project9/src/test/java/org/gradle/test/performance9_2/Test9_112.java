package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_112 {
    private final Production9_112 production = new Production9_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}