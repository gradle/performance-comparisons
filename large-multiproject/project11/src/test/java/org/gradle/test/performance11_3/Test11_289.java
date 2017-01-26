package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_289 {
    private final Production11_289 production = new Production11_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}