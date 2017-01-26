package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_247 {
    private final Production11_247 production = new Production11_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}