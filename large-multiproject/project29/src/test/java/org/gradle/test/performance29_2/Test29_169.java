package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_169 {
    private final Production29_169 production = new Production29_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}