package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_404 {
    private final Production65_404 production = new Production65_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}