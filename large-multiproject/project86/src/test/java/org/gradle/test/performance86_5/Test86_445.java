package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_445 {
    private final Production86_445 production = new Production86_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}