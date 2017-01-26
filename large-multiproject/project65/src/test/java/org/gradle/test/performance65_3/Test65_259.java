package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_259 {
    private final Production65_259 production = new Production65_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}