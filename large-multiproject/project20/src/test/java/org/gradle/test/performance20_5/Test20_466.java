package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_466 {
    private final Production20_466 production = new Production20_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}