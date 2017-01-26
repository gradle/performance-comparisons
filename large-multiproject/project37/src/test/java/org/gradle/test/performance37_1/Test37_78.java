package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_78 {
    private final Production37_78 production = new Production37_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}