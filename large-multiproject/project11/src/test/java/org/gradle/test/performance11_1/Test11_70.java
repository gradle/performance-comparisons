package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_70 {
    private final Production11_70 production = new Production11_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}