package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_455 {
    private final Production29_455 production = new Production29_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}