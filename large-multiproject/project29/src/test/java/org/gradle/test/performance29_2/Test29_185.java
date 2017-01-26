package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_185 {
    private final Production29_185 production = new Production29_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}