package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_61 {
    private final Production65_61 production = new Production65_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}