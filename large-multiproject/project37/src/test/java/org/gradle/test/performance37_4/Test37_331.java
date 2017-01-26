package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_331 {
    private final Production37_331 production = new Production37_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}