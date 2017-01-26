package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_229 {
    private final Production37_229 production = new Production37_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}