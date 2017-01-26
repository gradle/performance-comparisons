package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_38 {
    private final Production24_38 production = new Production24_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}