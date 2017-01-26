package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_321 {
    private final Production11_321 production = new Production11_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}