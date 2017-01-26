package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_154 {
    private final Production11_154 production = new Production11_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}