package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_49 {
    private final Production37_49 production = new Production37_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}