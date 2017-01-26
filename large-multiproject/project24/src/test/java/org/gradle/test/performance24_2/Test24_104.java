package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_104 {
    private final Production24_104 production = new Production24_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}