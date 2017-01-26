package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_156 {
    private final Production11_156 production = new Production11_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}