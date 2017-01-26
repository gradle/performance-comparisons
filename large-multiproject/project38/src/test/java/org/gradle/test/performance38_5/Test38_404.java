package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_404 {
    private final Production38_404 production = new Production38_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}