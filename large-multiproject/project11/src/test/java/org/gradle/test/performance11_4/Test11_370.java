package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_370 {
    private final Production11_370 production = new Production11_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}