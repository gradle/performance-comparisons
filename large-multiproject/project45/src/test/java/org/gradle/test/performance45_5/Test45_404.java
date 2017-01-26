package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_404 {
    private final Production45_404 production = new Production45_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}