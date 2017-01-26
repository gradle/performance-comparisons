package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_265 {
    private final Production11_265 production = new Production11_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}