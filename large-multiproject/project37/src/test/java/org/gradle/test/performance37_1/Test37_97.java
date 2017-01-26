package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_97 {
    private final Production37_97 production = new Production37_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}