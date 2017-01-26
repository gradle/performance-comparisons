package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_474 {
    private final Production24_474 production = new Production24_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}