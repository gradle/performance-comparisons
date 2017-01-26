package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_415 {
    private final Production24_415 production = new Production24_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}