package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_210 {
    private final Production11_210 production = new Production11_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}