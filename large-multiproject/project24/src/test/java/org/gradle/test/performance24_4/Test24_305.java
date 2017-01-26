package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_305 {
    private final Production24_305 production = new Production24_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}