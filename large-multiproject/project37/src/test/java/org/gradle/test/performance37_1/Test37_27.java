package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_27 {
    private final Production37_27 production = new Production37_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}