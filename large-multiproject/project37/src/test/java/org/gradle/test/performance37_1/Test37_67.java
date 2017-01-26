package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_67 {
    private final Production37_67 production = new Production37_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}