package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_29 {
    private final Production37_29 production = new Production37_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}