package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_196 {
    private final Production65_196 production = new Production65_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}