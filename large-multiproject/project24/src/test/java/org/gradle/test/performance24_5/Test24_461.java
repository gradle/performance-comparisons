package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_461 {
    private final Production24_461 production = new Production24_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}