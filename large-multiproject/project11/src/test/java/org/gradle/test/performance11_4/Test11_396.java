package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_396 {
    private final Production11_396 production = new Production11_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}