package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_281 {
    private final Production65_281 production = new Production65_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}