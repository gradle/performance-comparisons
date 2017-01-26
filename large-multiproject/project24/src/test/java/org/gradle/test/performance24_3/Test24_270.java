package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_270 {
    private final Production24_270 production = new Production24_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}