package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_65 {
    private final Production11_65 production = new Production11_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}