package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_255 {
    private final Production31_255 production = new Production31_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}