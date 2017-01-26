package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_48 {
    private final Production11_48 production = new Production11_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}