package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_122 {
    private final Production11_122 production = new Production11_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}