package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_10 {
    private final Production24_10 production = new Production24_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}