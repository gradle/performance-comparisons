package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_338 {
    private final Production37_338 production = new Production37_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}