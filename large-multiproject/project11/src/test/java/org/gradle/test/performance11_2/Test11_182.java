package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_182 {
    private final Production11_182 production = new Production11_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}