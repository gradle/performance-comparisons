package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_69 {
    private final Production11_69 production = new Production11_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}