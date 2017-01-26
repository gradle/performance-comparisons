package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_222 {
    private final Production65_222 production = new Production65_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}