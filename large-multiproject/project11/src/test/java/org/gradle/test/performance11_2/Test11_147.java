package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_147 {
    private final Production11_147 production = new Production11_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}