package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_35 {
    private final Production24_35 production = new Production24_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}