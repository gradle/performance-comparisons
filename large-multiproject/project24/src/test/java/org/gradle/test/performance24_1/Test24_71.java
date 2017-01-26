package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_71 {
    private final Production24_71 production = new Production24_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}