package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_255 {
    private final Production35_255 production = new Production35_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}