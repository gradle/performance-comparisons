package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_180 {
    private final Production11_180 production = new Production11_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}