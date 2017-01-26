package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_135 {
    private final Production11_135 production = new Production11_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}