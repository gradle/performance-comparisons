package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_66 {
    private final Production24_66 production = new Production24_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}