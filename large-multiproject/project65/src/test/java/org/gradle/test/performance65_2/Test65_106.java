package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_106 {
    private final Production65_106 production = new Production65_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}