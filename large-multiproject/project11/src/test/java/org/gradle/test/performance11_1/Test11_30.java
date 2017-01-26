package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_30 {
    private final Production11_30 production = new Production11_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}