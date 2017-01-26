package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_134 {
    private final Production11_134 production = new Production11_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}