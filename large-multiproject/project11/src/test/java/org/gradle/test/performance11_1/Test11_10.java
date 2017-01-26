package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_10 {
    private final Production11_10 production = new Production11_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}