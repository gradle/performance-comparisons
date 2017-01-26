package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_146 {
    private final Production65_146 production = new Production65_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}