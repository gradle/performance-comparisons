package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_362 {
    private final Production24_362 production = new Production24_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}