package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_388 {
    private final Production24_388 production = new Production24_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}