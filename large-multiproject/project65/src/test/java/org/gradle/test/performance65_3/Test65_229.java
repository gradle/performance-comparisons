package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_229 {
    private final Production65_229 production = new Production65_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}