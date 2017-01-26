package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_139 {
    private final Production65_139 production = new Production65_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}