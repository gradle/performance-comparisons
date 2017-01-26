package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_71 {
    private final Production37_71 production = new Production37_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}