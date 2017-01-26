package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_52 {
    private final Production11_52 production = new Production11_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}