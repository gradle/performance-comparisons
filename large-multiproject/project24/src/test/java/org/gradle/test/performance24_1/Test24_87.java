package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_87 {
    private final Production24_87 production = new Production24_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}