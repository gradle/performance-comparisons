package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_437 {
    private final Production24_437 production = new Production24_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}