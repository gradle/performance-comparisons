package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_446 {
    private final Production65_446 production = new Production65_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}