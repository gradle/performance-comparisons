package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_313 {
    private final Production65_313 production = new Production65_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}