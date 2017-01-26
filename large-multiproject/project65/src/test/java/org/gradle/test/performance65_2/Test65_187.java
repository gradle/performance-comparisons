package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_187 {
    private final Production65_187 production = new Production65_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}