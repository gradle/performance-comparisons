package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_294 {
    private final Production37_294 production = new Production37_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}