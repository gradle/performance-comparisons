package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_83 {
    private final Production11_83 production = new Production11_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}