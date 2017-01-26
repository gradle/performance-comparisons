package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_405 {
    private final Production9_405 production = new Production9_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}