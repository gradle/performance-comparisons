package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_47 {
    private final Production65_47 production = new Production65_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}