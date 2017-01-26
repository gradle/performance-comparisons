package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_246 {
    private final Production24_246 production = new Production24_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}