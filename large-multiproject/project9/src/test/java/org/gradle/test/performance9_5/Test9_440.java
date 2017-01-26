package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_440 {
    private final Production9_440 production = new Production9_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}