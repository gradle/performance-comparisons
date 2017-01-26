package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_418 {
    private final Production9_418 production = new Production9_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}