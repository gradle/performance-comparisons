package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_227 {
    private final Production9_227 production = new Production9_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}