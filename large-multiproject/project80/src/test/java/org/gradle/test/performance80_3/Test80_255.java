package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_255 {
    private final Production80_255 production = new Production80_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}