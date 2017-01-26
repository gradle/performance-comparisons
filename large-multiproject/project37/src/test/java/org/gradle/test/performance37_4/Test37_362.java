package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_362 {
    private final Production37_362 production = new Production37_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}