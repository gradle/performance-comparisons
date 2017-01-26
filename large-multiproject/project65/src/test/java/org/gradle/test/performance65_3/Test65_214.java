package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_214 {
    private final Production65_214 production = new Production65_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}