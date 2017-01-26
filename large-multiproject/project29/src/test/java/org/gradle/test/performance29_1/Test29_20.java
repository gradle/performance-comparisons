package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_20 {
    private final Production29_20 production = new Production29_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}