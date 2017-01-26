package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_472 {
    private final Production65_472 production = new Production65_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}