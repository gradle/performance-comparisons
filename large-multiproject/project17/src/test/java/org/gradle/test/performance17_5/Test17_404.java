package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_404 {
    private final Production17_404 production = new Production17_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}