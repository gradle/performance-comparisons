package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_100 {
    private final Production24_100 production = new Production24_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}