package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_172 {
    private final Production37_172 production = new Production37_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}