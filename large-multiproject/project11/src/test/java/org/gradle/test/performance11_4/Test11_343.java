package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_343 {
    private final Production11_343 production = new Production11_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}