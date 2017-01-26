package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_145 {
    private final Production11_145 production = new Production11_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}