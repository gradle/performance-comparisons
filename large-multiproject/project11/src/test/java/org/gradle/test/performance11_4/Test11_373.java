package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_373 {
    private final Production11_373 production = new Production11_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}