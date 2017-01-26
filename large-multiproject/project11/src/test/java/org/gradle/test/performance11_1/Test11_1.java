package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_1 {
    private final Production11_1 production = new Production11_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}