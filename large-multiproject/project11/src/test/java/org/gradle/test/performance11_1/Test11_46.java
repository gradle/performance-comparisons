package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_46 {
    private final Production11_46 production = new Production11_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}