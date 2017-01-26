package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_40 {
    private final Production37_40 production = new Production37_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}