package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_356 {
    private final Production37_356 production = new Production37_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}