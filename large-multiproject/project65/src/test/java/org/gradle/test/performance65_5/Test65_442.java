package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_442 {
    private final Production65_442 production = new Production65_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}