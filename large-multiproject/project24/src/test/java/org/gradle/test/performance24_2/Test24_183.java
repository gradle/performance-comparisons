package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_183 {
    private final Production24_183 production = new Production24_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}