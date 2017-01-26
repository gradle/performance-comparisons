package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_231 {
    private final Production24_231 production = new Production24_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}