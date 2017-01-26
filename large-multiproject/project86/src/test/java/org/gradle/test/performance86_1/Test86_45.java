package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_45 {
    private final Production86_45 production = new Production86_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}