package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_404 {
    private final Production85_404 production = new Production85_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}