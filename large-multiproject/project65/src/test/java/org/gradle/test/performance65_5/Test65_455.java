package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_455 {
    private final Production65_455 production = new Production65_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}