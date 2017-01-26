package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_202 {
    private final Production65_202 production = new Production65_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}