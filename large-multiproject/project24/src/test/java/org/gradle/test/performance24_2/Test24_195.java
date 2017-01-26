package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_195 {
    private final Production24_195 production = new Production24_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}