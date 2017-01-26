package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_415 {
    private final Production11_415 production = new Production11_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}