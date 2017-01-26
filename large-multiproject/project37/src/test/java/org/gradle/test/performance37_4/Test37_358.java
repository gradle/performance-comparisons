package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_358 {
    private final Production37_358 production = new Production37_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}