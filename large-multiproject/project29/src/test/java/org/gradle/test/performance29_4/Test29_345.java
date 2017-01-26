package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_345 {
    private final Production29_345 production = new Production29_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}