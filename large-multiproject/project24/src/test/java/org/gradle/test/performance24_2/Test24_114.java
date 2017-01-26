package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_114 {
    private final Production24_114 production = new Production24_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}