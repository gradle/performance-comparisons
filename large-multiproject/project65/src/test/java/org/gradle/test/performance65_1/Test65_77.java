package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_77 {
    private final Production65_77 production = new Production65_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}