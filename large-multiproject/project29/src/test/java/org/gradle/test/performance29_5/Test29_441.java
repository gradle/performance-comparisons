package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_441 {
    private final Production29_441 production = new Production29_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}