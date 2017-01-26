package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_257 {
    private final Production24_257 production = new Production24_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}