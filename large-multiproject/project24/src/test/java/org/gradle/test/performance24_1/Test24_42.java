package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_42 {
    private final Production24_42 production = new Production24_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}