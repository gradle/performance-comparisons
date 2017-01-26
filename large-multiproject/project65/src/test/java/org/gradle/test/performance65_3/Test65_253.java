package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_253 {
    private final Production65_253 production = new Production65_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}