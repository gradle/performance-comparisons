package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_404 {
    private final Production2_404 production = new Production2_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}