package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_35 {
    private final Production11_35 production = new Production11_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}