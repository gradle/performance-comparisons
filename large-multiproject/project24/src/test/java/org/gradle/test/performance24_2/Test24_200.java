package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_200 {
    private final Production24_200 production = new Production24_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}