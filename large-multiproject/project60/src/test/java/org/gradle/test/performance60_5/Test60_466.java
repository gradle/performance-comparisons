package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_466 {
    private final Production60_466 production = new Production60_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}