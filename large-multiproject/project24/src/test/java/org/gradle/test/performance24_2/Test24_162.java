package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_162 {
    private final Production24_162 production = new Production24_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}