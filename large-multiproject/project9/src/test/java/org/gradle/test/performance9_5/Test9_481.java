package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_481 {
    private final Production9_481 production = new Production9_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}