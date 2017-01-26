package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_302 {
    private final Production11_302 production = new Production11_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}