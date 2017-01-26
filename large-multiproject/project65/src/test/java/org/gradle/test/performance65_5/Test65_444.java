package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_444 {
    private final Production65_444 production = new Production65_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}