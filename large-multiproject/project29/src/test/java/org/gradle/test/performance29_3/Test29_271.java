package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_271 {
    private final Production29_271 production = new Production29_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}