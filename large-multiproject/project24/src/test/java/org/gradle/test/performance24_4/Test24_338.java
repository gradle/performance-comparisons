package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_338 {
    private final Production24_338 production = new Production24_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}