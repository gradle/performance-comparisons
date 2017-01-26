package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_138 {
    private final Production9_138 production = new Production9_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}