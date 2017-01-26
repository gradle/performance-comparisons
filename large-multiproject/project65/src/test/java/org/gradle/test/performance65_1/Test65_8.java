package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_8 {
    private final Production65_8 production = new Production65_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}