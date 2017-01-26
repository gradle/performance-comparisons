package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_36 {
    private final Production11_36 production = new Production11_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}