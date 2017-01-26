package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_137 {
    private final Production24_137 production = new Production24_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}