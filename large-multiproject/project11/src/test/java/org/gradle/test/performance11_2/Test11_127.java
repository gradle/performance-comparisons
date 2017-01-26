package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_127 {
    private final Production11_127 production = new Production11_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}