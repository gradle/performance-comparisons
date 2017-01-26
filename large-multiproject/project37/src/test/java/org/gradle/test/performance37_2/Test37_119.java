package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_119 {
    private final Production37_119 production = new Production37_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}