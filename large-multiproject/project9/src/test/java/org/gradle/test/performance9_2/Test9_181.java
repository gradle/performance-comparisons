package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_181 {
    private final Production9_181 production = new Production9_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}