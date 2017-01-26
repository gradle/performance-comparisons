package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_12 {
    private final Production11_12 production = new Production11_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}