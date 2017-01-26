package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_255 {
    private final Production4_255 production = new Production4_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}