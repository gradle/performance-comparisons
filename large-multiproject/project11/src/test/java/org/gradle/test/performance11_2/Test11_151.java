package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_151 {
    private final Production11_151 production = new Production11_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}