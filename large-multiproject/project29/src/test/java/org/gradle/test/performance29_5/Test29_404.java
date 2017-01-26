package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_404 {
    private final Production29_404 production = new Production29_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}