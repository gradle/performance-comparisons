package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_167 {
    private final Production37_167 production = new Production37_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}