package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_208 {
    private final Production11_208 production = new Production11_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}