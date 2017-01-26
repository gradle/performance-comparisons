package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_40 {
    private final Production24_40 production = new Production24_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}