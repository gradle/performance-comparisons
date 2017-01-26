package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_249 {
    private final Production11_249 production = new Production11_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}