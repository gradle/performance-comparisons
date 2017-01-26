package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_229 {
    private final Production24_229 production = new Production24_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}