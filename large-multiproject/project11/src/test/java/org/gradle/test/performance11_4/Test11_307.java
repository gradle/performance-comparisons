package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_307 {
    private final Production11_307 production = new Production11_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}