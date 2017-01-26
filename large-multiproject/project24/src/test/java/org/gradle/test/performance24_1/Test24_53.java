package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_53 {
    private final Production24_53 production = new Production24_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}