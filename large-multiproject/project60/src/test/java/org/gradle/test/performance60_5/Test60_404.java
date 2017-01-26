package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_404 {
    private final Production60_404 production = new Production60_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}