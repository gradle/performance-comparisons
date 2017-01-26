package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_3 {
    private final Production11_3 production = new Production11_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}