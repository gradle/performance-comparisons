package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_72 {
    private final Production37_72 production = new Production37_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}