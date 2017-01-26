package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_187 {
    private final Production11_187 production = new Production11_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}