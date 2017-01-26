package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_75 {
    private final Production24_75 production = new Production24_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}