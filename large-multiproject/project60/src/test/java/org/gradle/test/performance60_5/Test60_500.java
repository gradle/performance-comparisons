package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_500 {
    private final Production60_500 production = new Production60_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}