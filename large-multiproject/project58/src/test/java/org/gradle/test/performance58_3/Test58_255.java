package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_255 {
    private final Production58_255 production = new Production58_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}