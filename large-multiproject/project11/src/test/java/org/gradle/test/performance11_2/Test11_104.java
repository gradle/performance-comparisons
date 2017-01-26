package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_104 {
    private final Production11_104 production = new Production11_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}