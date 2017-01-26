package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_466 {
    private final Production23_466 production = new Production23_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}