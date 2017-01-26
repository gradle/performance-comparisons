package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_499 {
    private final Production29_499 production = new Production29_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}