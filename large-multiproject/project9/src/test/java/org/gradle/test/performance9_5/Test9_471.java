package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_471 {
    private final Production9_471 production = new Production9_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}