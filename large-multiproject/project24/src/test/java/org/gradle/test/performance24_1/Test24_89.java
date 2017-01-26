package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_89 {
    private final Production24_89 production = new Production24_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}