package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_472 {
    private final Production29_472 production = new Production29_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}