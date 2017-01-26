package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_286 {
    private final Production24_286 production = new Production24_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}