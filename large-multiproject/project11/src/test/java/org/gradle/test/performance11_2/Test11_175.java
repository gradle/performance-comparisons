package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_175 {
    private final Production11_175 production = new Production11_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}