package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_202 {
    private final Production24_202 production = new Production24_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}