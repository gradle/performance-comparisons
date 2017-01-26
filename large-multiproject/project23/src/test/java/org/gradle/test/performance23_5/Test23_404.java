package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_404 {
    private final Production23_404 production = new Production23_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}