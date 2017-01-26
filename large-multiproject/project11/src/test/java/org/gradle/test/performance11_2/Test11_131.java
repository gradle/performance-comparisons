package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_131 {
    private final Production11_131 production = new Production11_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}