package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_255 {
    private final Production37_255 production = new Production37_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}