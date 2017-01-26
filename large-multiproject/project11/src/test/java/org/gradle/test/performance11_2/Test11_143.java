package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_143 {
    private final Production11_143 production = new Production11_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}