package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_466 {
    private final Production79_466 production = new Production79_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}