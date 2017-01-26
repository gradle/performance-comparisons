package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_74 {
    private final Production11_74 production = new Production11_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}