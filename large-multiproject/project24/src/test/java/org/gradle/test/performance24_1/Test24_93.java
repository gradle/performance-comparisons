package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_93 {
    private final Production24_93 production = new Production24_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}