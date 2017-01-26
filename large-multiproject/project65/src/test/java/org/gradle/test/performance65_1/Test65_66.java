package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_66 {
    private final Production65_66 production = new Production65_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}