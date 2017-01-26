package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_301 {
    private final Production11_301 production = new Production11_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}