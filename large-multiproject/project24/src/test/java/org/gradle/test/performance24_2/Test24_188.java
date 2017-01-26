package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_188 {
    private final Production24_188 production = new Production24_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}