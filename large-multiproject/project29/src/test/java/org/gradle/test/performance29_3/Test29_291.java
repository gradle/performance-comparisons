package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_291 {
    private final Production29_291 production = new Production29_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}