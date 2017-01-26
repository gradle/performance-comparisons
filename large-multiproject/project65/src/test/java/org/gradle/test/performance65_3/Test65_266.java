package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_266 {
    private final Production65_266 production = new Production65_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}