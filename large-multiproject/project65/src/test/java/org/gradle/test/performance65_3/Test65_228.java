package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_228 {
    private final Production65_228 production = new Production65_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}