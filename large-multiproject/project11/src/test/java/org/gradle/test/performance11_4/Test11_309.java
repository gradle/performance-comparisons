package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_309 {
    private final Production11_309 production = new Production11_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}