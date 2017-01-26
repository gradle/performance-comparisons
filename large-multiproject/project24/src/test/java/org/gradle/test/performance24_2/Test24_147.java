package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_147 {
    private final Production24_147 production = new Production24_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}