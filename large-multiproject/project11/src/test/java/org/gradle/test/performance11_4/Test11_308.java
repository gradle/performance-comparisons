package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_308 {
    private final Production11_308 production = new Production11_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}