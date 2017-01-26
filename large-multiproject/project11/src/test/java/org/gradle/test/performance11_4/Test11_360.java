package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_360 {
    private final Production11_360 production = new Production11_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}