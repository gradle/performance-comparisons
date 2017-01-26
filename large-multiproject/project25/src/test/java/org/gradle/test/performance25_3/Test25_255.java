package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_255 {
    private final Production25_255 production = new Production25_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}