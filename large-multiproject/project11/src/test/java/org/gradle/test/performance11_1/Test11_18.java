package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_18 {
    private final Production11_18 production = new Production11_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}