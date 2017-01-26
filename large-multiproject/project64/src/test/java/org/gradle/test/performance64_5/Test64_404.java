package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_404 {
    private final Production64_404 production = new Production64_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}