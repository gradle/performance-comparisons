package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_54 {
    private final Production11_54 production = new Production11_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}