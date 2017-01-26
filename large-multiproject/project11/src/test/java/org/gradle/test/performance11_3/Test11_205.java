package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_205 {
    private final Production11_205 production = new Production11_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}