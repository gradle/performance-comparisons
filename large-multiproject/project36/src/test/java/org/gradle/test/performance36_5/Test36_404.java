package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_404 {
    private final Production36_404 production = new Production36_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}