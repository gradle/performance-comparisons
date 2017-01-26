package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_339 {
    private final Production11_339 production = new Production11_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}