package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_330 {
    private final Production65_330 production = new Production65_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}