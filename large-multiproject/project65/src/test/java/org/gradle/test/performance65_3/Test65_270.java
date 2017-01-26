package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_270 {
    private final Production65_270 production = new Production65_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}