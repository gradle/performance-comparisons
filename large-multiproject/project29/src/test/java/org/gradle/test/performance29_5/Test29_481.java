package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_481 {
    private final Production29_481 production = new Production29_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}