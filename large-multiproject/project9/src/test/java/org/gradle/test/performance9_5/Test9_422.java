package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_422 {
    private final Production9_422 production = new Production9_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}