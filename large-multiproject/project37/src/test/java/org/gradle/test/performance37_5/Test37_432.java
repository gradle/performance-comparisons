package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_432 {
    private final Production37_432 production = new Production37_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}