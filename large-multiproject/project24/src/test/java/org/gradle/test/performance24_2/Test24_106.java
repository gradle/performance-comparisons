package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_106 {
    private final Production24_106 production = new Production24_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}