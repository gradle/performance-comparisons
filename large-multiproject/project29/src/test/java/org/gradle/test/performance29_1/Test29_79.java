package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_79 {
    private final Production29_79 production = new Production29_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}