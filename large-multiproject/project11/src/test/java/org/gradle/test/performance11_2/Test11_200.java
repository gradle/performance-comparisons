package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_200 {
    private final Production11_200 production = new Production11_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}