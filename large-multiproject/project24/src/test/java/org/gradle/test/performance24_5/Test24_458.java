package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_458 {
    private final Production24_458 production = new Production24_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}