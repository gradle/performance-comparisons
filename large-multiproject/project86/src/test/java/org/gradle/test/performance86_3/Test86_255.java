package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_255 {
    private final Production86_255 production = new Production86_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}