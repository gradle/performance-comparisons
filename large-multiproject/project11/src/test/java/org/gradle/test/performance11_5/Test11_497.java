package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_497 {
    private final Production11_497 production = new Production11_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}