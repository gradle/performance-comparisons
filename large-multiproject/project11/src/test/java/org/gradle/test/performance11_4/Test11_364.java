package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_364 {
    private final Production11_364 production = new Production11_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}