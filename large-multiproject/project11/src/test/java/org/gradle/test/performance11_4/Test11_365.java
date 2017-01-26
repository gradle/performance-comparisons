package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_365 {
    private final Production11_365 production = new Production11_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}