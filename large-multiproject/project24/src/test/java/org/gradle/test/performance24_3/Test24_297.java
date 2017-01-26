package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_297 {
    private final Production24_297 production = new Production24_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}