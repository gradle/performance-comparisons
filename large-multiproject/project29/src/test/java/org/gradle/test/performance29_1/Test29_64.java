package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_64 {
    private final Production29_64 production = new Production29_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}