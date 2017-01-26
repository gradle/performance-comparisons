package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_228 {
    private final Production24_228 production = new Production24_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}