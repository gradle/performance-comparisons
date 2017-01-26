package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_405 {
    private final Production65_405 production = new Production65_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}