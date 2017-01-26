package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_139 {
    private final Production11_139 production = new Production11_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}