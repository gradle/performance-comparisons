package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_286 {
    private final Production65_286 production = new Production65_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}