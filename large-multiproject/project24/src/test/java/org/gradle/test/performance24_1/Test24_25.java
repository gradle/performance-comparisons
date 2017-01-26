package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_25 {
    private final Production24_25 production = new Production24_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}