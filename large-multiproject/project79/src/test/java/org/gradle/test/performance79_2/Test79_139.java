package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_139 {
    private final Production79_139 production = new Production79_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}