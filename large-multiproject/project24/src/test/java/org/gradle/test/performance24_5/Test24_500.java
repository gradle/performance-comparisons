package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_500 {
    private final Production24_500 production = new Production24_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}