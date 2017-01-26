package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_75 {
    private final Production37_75 production = new Production37_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}