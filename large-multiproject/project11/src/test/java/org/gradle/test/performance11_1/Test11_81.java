package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_81 {
    private final Production11_81 production = new Production11_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}