package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_325 {
    private final Production24_325 production = new Production24_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}