package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_25 {
    private final Production11_25 production = new Production11_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}