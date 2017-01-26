package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_481 {
    private final Production20_481 production = new Production20_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}