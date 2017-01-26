package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_479 {
    private final Production11_479 production = new Production11_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}