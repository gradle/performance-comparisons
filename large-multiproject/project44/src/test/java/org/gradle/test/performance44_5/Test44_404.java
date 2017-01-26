package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_404 {
    private final Production44_404 production = new Production44_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}