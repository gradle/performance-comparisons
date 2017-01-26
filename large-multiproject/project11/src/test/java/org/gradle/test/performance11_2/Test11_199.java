package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_199 {
    private final Production11_199 production = new Production11_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}