package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_152 {
    private final Production11_152 production = new Production11_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}