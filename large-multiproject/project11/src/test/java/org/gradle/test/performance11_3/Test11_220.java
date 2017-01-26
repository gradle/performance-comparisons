package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_220 {
    private final Production11_220 production = new Production11_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}