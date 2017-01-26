package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_339 {
    private final Production29_339 production = new Production29_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}