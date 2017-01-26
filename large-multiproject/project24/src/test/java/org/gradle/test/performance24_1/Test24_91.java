package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_91 {
    private final Production24_91 production = new Production24_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}