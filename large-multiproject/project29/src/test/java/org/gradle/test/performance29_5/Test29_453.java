package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_453 {
    private final Production29_453 production = new Production29_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}