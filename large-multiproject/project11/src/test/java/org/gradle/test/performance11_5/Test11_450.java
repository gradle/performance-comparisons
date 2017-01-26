package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_450 {
    private final Production11_450 production = new Production11_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}