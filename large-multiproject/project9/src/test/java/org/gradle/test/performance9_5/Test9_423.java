package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_423 {
    private final Production9_423 production = new Production9_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}