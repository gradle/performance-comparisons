package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_444 {
    private final Production24_444 production = new Production24_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}