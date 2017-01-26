package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_339 {
    private final Production60_339 production = new Production60_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}