package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_42 {
    private final Production65_42 production = new Production65_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}