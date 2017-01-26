package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_466 {
    private final Production9_466 production = new Production9_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}