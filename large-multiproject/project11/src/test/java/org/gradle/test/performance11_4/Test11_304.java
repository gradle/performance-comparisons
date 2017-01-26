package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_304 {
    private final Production11_304 production = new Production11_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}