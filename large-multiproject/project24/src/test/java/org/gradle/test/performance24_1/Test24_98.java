package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_98 {
    private final Production24_98 production = new Production24_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}