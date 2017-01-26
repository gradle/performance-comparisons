package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_421 {
    private final Production11_421 production = new Production11_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}