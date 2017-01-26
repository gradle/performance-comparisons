package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_181 {
    private final Production65_181 production = new Production65_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}