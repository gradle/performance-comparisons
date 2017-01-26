package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_204 {
    private final Production11_204 production = new Production11_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}