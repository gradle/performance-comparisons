package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_91 {
    private final Production65_91 production = new Production65_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}