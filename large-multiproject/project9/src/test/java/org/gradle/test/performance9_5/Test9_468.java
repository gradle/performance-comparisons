package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_468 {
    private final Production9_468 production = new Production9_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}