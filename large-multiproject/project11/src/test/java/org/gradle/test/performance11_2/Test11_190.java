package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_190 {
    private final Production11_190 production = new Production11_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}