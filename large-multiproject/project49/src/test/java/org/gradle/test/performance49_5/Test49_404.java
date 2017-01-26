package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_404 {
    private final Production49_404 production = new Production49_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}