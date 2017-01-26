package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_306 {
    private final Production11_306 production = new Production11_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}