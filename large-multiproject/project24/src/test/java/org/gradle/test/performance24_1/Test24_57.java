package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_57 {
    private final Production24_57 production = new Production24_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}