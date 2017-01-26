package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_107 {
    private final Production65_107 production = new Production65_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}