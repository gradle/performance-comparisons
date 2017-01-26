package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_404 {
    private final Production11_404 production = new Production11_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}