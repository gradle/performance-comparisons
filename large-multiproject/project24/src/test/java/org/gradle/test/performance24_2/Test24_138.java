package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_138 {
    private final Production24_138 production = new Production24_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}