package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_164 {
    private final Production11_164 production = new Production11_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}