package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_241 {
    private final Production11_241 production = new Production11_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}