package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_379 {
    private final Production11_379 production = new Production11_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}