package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_481 {
    private final Production60_481 production = new Production60_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}