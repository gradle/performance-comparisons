package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_289 {
    private final Production37_289 production = new Production37_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}