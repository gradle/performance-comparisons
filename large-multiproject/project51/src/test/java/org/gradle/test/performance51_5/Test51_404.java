package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_404 {
    private final Production51_404 production = new Production51_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}