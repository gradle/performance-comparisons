package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_268 {
    private final Production24_268 production = new Production24_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}