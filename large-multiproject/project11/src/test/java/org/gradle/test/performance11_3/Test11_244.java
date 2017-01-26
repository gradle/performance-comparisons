package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_244 {
    private final Production11_244 production = new Production11_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}