package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_482 {
    private final Production11_482 production = new Production11_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}