package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_139 {
    private final Production24_139 production = new Production24_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}