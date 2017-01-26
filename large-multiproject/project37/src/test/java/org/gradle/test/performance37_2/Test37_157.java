package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_157 {
    private final Production37_157 production = new Production37_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}