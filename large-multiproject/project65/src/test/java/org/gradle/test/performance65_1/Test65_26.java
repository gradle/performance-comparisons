package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_26 {
    private final Production65_26 production = new Production65_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}