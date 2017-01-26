package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_34 {
    private final Production24_34 production = new Production24_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}