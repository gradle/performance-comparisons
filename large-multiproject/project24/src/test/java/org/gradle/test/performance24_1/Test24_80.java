package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_80 {
    private final Production24_80 production = new Production24_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}