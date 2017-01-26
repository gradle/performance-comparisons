package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_7 {
    private final Production65_7 production = new Production65_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}