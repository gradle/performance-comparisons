package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_81 {
    private final Production65_81 production = new Production65_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}