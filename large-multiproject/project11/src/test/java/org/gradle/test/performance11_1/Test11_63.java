package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_63 {
    private final Production11_63 production = new Production11_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}