package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_201 {
    private final Production29_201 production = new Production29_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}