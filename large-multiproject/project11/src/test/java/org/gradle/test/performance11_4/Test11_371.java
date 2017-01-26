package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_371 {
    private final Production11_371 production = new Production11_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}