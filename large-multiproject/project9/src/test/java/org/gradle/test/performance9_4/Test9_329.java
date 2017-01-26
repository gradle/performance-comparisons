package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_329 {
    private final Production9_329 production = new Production9_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}