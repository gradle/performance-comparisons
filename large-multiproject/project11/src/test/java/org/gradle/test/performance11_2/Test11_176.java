package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_176 {
    private final Production11_176 production = new Production11_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}