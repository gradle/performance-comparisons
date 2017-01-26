package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_29 {
    private final Production24_29 production = new Production24_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}