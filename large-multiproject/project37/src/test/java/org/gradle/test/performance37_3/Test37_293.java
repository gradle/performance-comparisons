package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_293 {
    private final Production37_293 production = new Production37_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}