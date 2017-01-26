package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_113 {
    private final Production11_113 production = new Production11_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}