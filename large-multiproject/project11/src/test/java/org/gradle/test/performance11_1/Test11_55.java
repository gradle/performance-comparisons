package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_55 {
    private final Production11_55 production = new Production11_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}