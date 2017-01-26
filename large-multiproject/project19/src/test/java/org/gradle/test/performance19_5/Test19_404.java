package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_404 {
    private final Production19_404 production = new Production19_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}