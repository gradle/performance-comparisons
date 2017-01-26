package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_466 {
    private final Production11_466 production = new Production11_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}