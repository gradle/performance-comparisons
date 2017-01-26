package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_2 {
    private final Production24_2 production = new Production24_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}